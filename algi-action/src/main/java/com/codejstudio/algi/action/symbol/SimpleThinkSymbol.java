package com.codejstudio.algi.action.symbol;

import com.codejstudio.algi.action.symbolElement.SimpleThinkSymbolElement;
import com.codejstudio.lim.pojo.i.ISymbolCombination;
import com.codejstudio.lim.pojo.i.ISymbolElement;
import com.codejstudio.lim.pojo.util.SymbolConstant;
import com.codejstudio.lim.pojo.util.SymbolUtil;

/**
 * @Description TODO
 * 
 * @author <ul><li>Jeffrey Jiang</li></ul>
 * @see     
 * @since   algi_v1.0.0
 */
public class SimpleThinkSymbol extends AbstractSingleContentSymbol {

	/* constants */

	private static final long serialVersionUID = -48750856694812297L;

	public static final String SYMBOL = "st";//Simple Think

	public static final Class<? extends ISymbolElement> SYMBOL_ELEMENT_CLAZZ 
			= SimpleThinkSymbolElement.class;
	private static final SimpleThinkSymbol SYMBOL_INSTANCE = new SimpleThinkSymbol();
	private static final SimpleSurroundingSymbolCombination SYMBOL_COMBINATION_INSTANCE;

	private static final Class<?> TYPE = String.class;


	/* constructors */

	private SimpleThinkSymbol() {
		super();
	}


	/* initializers */

	/**
	 * only for com.codejstudio.lim.common.util.InitializationUtil#autoInit() usage
	 */
	static void autoInit() {}

	static {
		SYMBOL_COMBINATION_INSTANCE = new SimpleSurroundingSymbolCombination(SYMBOL_INSTANCE, 
				getSurroundingSymbolCombination(SYMBOL), SYMBOL_ELEMENT_CLAZZ);
		SymbolUtil.registerSymbolCombinationForInit(SYMBOL_COMBINATION_INSTANCE);
		SymbolConstant.registerSymbolClassForInit(SimpleThinkSymbol.class);
	}


	/* getters & setters */

	public static SimpleThinkSymbol getInstance() {
		return SYMBOL_INSTANCE;
	}

	public static ISymbolCombination getSymbolCombinationInstance() {
		return SYMBOL_COMBINATION_INSTANCE;
	}


	@Override
	public String getInnerSymbol() {
		return SYMBOL;
	}

	@Override
	public Class<? extends ISymbolElement> getSymbolElementClass() {
		return SYMBOL_ELEMENT_CLAZZ;
	}

	@Override
	public Class<?> getContentType() {
		return TYPE;
	}

}
