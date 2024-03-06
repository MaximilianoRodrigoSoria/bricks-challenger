package com.bricks.challanger.util;

import com.bricks.challanger.models.dtos.CategoryDTO;
import com.bricks.challanger.models.dtos.ProductDTO;
import com.bricks.challanger.models.entities.Category;
import com.bricks.challanger.models.entities.Product;
import com.bricks.challanger.utils.enums.State;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Data {
    public  final static Category CATEGORY =  new Category(1,"GAS","Gastronomía","Gastronomía","svg width=\\\"20\\\" height=\\\"20\\\" viewBox=\\\"0 0 20 20\\\" fill=\\\"none\\\" xmlns=\\\"http://www.w3.org/2000/svg\\\">\\r\\n<mask id=\\\"mask0_3874_1229\\\" style=\\\"mask-type:alpha\\\" maskUnits=\\\"userSpaceOnUse\\\" x=\\\"0\\\" y=\\\"0\\\" width=\\\"20\\\" height=\\\"20\\\">\\r\\n<rect width=\\\"20\\\" height=\\\"20\\\" fill=\\\"#D9D9D9\\\"/>\\r\\n</mask>\\r\\n<g mask=\\\"url(#mask0_3874_1229)\\\">\\r\\n<path d=\\\"M14.3585 17.9168C14.2403 17.9168 14.1414 17.8769 14.0618 17.797C13.9822 17.7172 13.9424 17.6182 13.9424 17.5002V11.2502H13.2373C12.8671 11.2502 12.5502 11.1184 12.2865 10.8547C12.0229 10.5911 11.8911 10.2742 11.8911 9.90402V5.8335C11.8911 4.90508 12.1531 4.0827 12.6772 3.36635C13.2012 2.65 13.9007 2.23307 14.7757 2.11554V17.5002C14.7757 17.6182 14.7357 17.7172 14.6558 17.797C14.5758 17.8769 14.4767 17.9168 14.3585 17.9168ZM6.66617 17.9168C6.54795 17.9168 6.44905 17.8769 6.36947 17.797C6.28987 17.7172 6.25007 17.6182 6.25007 17.5002V10.388C5.60583 10.2897 5.06016 9.99429 4.61305 9.50177C4.16594 9.00924 3.94238 8.40614 3.94238 7.69248V2.50016C3.94238 2.38211 3.98236 2.28315 4.06232 2.20329C4.14229 2.12343 4.24139 2.0835 4.35961 2.0835C4.47782 2.0835 4.57672 2.12343 4.65632 2.20329C4.73592 2.28315 4.77572 2.38211 4.77572 2.50016V7.69248H6.25007V2.50016C6.25007 2.38211 6.29006 2.28315 6.37003 2.20329C6.44999 2.12343 6.54908 2.0835 6.6673 2.0835C6.78552 2.0835 6.88442 2.12343 6.96401 2.20329C7.04361 2.28315 7.0834 2.38211 7.0834 2.50016V7.69248H8.55776V2.50016C8.55776 2.38211 8.59774 2.28315 8.67772 2.20329C8.75769 2.12343 8.85678 2.0835 8.97499 2.0835C9.09321 2.0835 9.19212 2.12343 9.27172 2.20329C9.3513 2.28315 9.39109 2.38211 9.39109 2.50016V7.69248C9.39109 8.40614 9.16754 9.00924 8.72042 9.50177C8.27331 9.99429 7.72764 10.2897 7.0834 10.388V17.5002C7.0834 17.6182 7.04342 17.7172 6.96345 17.797C6.88349 17.8769 6.7844 17.9168 6.66617 17.9168Z\\\" fill=\\\"#868BC3\\\"/>\\r\\n</g>\\r\\n</svg>\"", State.ENABLED);
    public  final static CategoryDTO CATEGORY_DTO =  new CategoryDTO(1,"GAS","Gastronomía","Gastronomía","svg width=\\\"20\\\" height=\\\"20\\\" viewBox=\\\"0 0 20 20\\\" fill=\\\"none\\\" xmlns=\\\"http://www.w3.org/2000/svg\\\">\\r\\n<mask id=\\\"mask0_3874_1229\\\" style=\\\"mask-type:alpha\\\" maskUnits=\\\"userSpaceOnUse\\\" x=\\\"0\\\" y=\\\"0\\\" width=\\\"20\\\" height=\\\"20\\\">\\r\\n<rect width=\\\"20\\\" height=\\\"20\\\" fill=\\\"#D9D9D9\\\"/>\\r\\n</mask>\\r\\n<g mask=\\\"url(#mask0_3874_1229)\\\">\\r\\n<path d=\\\"M14.3585 17.9168C14.2403 17.9168 14.1414 17.8769 14.0618 17.797C13.9822 17.7172 13.9424 17.6182 13.9424 17.5002V11.2502H13.2373C12.8671 11.2502 12.5502 11.1184 12.2865 10.8547C12.0229 10.5911 11.8911 10.2742 11.8911 9.90402V5.8335C11.8911 4.90508 12.1531 4.0827 12.6772 3.36635C13.2012 2.65 13.9007 2.23307 14.7757 2.11554V17.5002C14.7757 17.6182 14.7357 17.7172 14.6558 17.797C14.5758 17.8769 14.4767 17.9168 14.3585 17.9168ZM6.66617 17.9168C6.54795 17.9168 6.44905 17.8769 6.36947 17.797C6.28987 17.7172 6.25007 17.6182 6.25007 17.5002V10.388C5.60583 10.2897 5.06016 9.99429 4.61305 9.50177C4.16594 9.00924 3.94238 8.40614 3.94238 7.69248V2.50016C3.94238 2.38211 3.98236 2.28315 4.06232 2.20329C4.14229 2.12343 4.24139 2.0835 4.35961 2.0835C4.47782 2.0835 4.57672 2.12343 4.65632 2.20329C4.73592 2.28315 4.77572 2.38211 4.77572 2.50016V7.69248H6.25007V2.50016C6.25007 2.38211 6.29006 2.28315 6.37003 2.20329C6.44999 2.12343 6.54908 2.0835 6.6673 2.0835C6.78552 2.0835 6.88442 2.12343 6.96401 2.20329C7.04361 2.28315 7.0834 2.38211 7.0834 2.50016V7.69248H8.55776V2.50016C8.55776 2.38211 8.59774 2.28315 8.67772 2.20329C8.75769 2.12343 8.85678 2.0835 8.97499 2.0835C9.09321 2.0835 9.19212 2.12343 9.27172 2.20329C9.3513 2.28315 9.39109 2.38211 9.39109 2.50016V7.69248C9.39109 8.40614 9.16754 9.00924 8.72042 9.50177C8.27331 9.99429 7.72764 10.2897 7.0834 10.388V17.5002C7.0834 17.6182 7.04342 17.7172 6.96345 17.797C6.88349 17.8769 6.7844 17.9168 6.66617 17.9168Z\\\" fill=\\\"#868BC3\\\"/>\\r\\n</g>\\r\\n</svg>\"", State.ENABLED);

    public  final static ProductDTO PRODUCT_DTO =  new ProductDTO(1, "Product 1", 10.0, 1, CATEGORY_DTO, State.ENABLED);
    public  final static Product PRODUCT =  new Product(1L, "Product 1", 10.0, 1, CATEGORY, State.ENABLED);
    public final  static List<CategoryDTO> CATEGORY_DTO_LIST = Arrays.asList(
            new CategoryDTO(1,"GAS","Gastronomía","Gastronomía","svg width=\\\"20\\\" height=\\\"20\\\" viewBox=\\\"0 0 20 20\\\" fill=\\\"none\\\" xmlns=\\\"http://www.w3.org/2000/svg\\\">\\r\\n<mask id=\\\"mask0_3874_1229\\\" style=\\\"mask-type:alpha\\\" maskUnits=\\\"userSpaceOnUse\\\" x=\\\"0\\\" y=\\\"0\\\" width=\\\"20\\\" height=\\\"20\\\">\\r\\n<rect width=\\\"20\\\" height=\\\"20\\\" fill=\\\"#D9D9D9\\\"/>\\r\\n</mask>\\r\\n<g mask=\\\"url(#mask0_3874_1229)\\\">\\r\\n<path d=\\\"M14.3585 17.9168C14.2403 17.9168 14.1414 17.8769 14.0618 17.797C13.9822 17.7172 13.9424 17.6182 13.9424 17.5002V11.2502H13.2373C12.8671 11.2502 12.5502 11.1184 12.2865 10.8547C12.0229 10.5911 11.8911 10.2742 11.8911 9.90402V5.8335C11.8911 4.90508 12.1531 4.0827 12.6772 3.36635C13.2012 2.65 13.9007 2.23307 14.7757 2.11554V17.5002C14.7757 17.6182 14.7357 17.7172 14.6558 17.797C14.5758 17.8769 14.4767 17.9168 14.3585 17.9168ZM6.66617 17.9168C6.54795 17.9168 6.44905 17.8769 6.36947 17.797C6.28987 17.7172 6.25007 17.6182 6.25007 17.5002V10.388C5.60583 10.2897 5.06016 9.99429 4.61305 9.50177C4.16594 9.00924 3.94238 8.40614 3.94238 7.69248V2.50016C3.94238 2.38211 3.98236 2.28315 4.06232 2.20329C4.14229 2.12343 4.24139 2.0835 4.35961 2.0835C4.47782 2.0835 4.57672 2.12343 4.65632 2.20329C4.73592 2.28315 4.77572 2.38211 4.77572 2.50016V7.69248H6.25007V2.50016C6.25007 2.38211 6.29006 2.28315 6.37003 2.20329C6.44999 2.12343 6.54908 2.0835 6.6673 2.0835C6.78552 2.0835 6.88442 2.12343 6.96401 2.20329C7.04361 2.28315 7.0834 2.38211 7.0834 2.50016V7.69248H8.55776V2.50016C8.55776 2.38211 8.59774 2.28315 8.67772 2.20329C8.75769 2.12343 8.85678 2.0835 8.97499 2.0835C9.09321 2.0835 9.19212 2.12343 9.27172 2.20329C9.3513 2.28315 9.39109 2.38211 9.39109 2.50016V7.69248C9.39109 8.40614 9.16754 9.00924 8.72042 9.50177C8.27331 9.99429 7.72764 10.2897 7.0834 10.388V17.5002C7.0834 17.6182 7.04342 17.7172 6.96345 17.797C6.88349 17.8769 6.7844 17.9168 6.66617 17.9168Z\\\" fill=\\\"#868BC3\\\"/>\\r\\n</g>\\r\\n</svg>\"", State.ENABLED),
            new CategoryDTO(2,"VIA","Viajes","Viajes","svg width=\\\"20\\\" height=\\\"20\\\" viewBox=\\\"0 0 20 20\\\" fill=\\\"none\\\" xmlns=\\\"http://www.w3.org/2000/svg\\\">\\r\\n<mask id=\\\"mask0_3874_1378\\\" style=\\\"mask-type:alpha\\\" maskUnits=\\\"userSpaceOnUse\\\" x=\\\"0\\\" y=\\\"0\\\" width=\\\"20\\\" height=\\\"20\\\">\\r\\n<rect width=\\\"20\\\" height=\\\"20\\\" fill=\\\"#D9D9D9\\\"/>\\r\\n</mask>\\r\\n<g mask=\\\"url(#mask0_3874_1378)\\\">\\r\\n<path d=\\\"M7.94887 17.6556C7.81961 17.693 7.7125 17.6781 7.62756 17.6107C7.54263 17.5434 7.50016 17.4462 7.50016 17.3191C7.50016 17.2536 7.51859 17.186 7.55545 17.1164C7.59232 17.0467 7.63532 16.9914 7.68445 16.9505L9.16683 15.8655V10.7053L2.6492 12.6204C2.49643 12.6609 2.36395 12.6414 2.25177 12.5618C2.13959 12.4821 2.0835 12.359 2.0835 12.1925C2.0835 12.109 2.1075 12.0236 2.1555 11.9364C2.20351 11.8491 2.26445 11.7865 2.33831 11.7486L9.16683 7.72452V2.91683C9.16683 2.67609 9.24582 2.47702 9.40379 2.3196C9.56176 2.1622 9.76154 2.0835 10.0031 2.0835C10.2448 2.0835 10.4435 2.1622 10.5995 2.3196C10.7555 2.47702 10.8335 2.67609 10.8335 2.91683V7.72452L17.662 11.7486C17.7359 11.7849 17.7968 11.8465 17.8448 11.9336C17.8928 12.0207 17.9168 12.1068 17.9168 12.1919C17.9168 12.3622 17.8607 12.4863 17.7486 12.5643C17.6364 12.6423 17.5039 12.6609 17.3511 12.6204L10.8335 10.7053V15.8335L12.3159 16.9505C12.365 16.9914 12.408 17.0467 12.4449 17.1164C12.4817 17.186 12.5002 17.2536 12.5002 17.3191C12.5002 17.4462 12.4577 17.5434 12.3728 17.6107C12.2878 17.6781 12.1807 17.693 12.0515 17.6556L10.0002 17.0515L7.94887 17.6556Z\\\" fill=\\\"#868BC3\\\"/>\\r\\n</g>\\r\\n</svg>\"", State.ENABLED),
            new CategoryDTO(3,"IND","Indumentaria","Indumentaria","svg width=\\\"20\\\" height=\\\"20\\\" viewBox=\\\"0 0 20 20\\\" fill=\\\"none\\\" xmlns=\\\"http://www.w3.org/2000/svg\\\">\\r\\n<mask id=\\\"mask0_3874_5213\\\" style=\\\"mask-type:alpha\\\" maskUnits=\\\"userSpaceOnUse\\\" x=\\\"0\\\" y=\\\"0\\\" width=\\\"20\\\" height=\\\"20\\\">\\r\\n<rect width=\\\"20\\\" height=\\\"20\\\" fill=\\\"#D9D9D9\\\"/>\\r\\n</mask>\\r\\n<g mask=\\\"url(#mask0_3874_5213)\\\">\\r\\n<path d=\\\"M2.4998 16.25C2.3 16.25 2.16966 16.1552 2.10877 15.9655C2.04787 15.7759 2.09702 15.6218 2.25621 15.5032L9.58313 10V8.33333C9.58313 8.22543 9.61946 8.12901 9.69211 8.04406C9.76475 7.95913 9.86036 7.91667 9.97896 7.91667C10.4576 7.93056 10.8585 7.77591 11.1817 7.45273C11.5049 7.12953 11.6665 6.72863 11.6665 6.25C11.6665 5.79594 11.5057 5.40465 11.1841 5.07612C10.8625 4.7476 10.4747 4.58333 10.0206 4.58333C9.68516 4.58333 9.37506 4.67762 9.09034 4.86619C8.80562 5.05476 8.59862 5.30449 8.46936 5.6154C8.43196 5.69338 8.382 5.7492 8.3195 5.78285C8.257 5.81651 8.18516 5.83333 8.10396 5.83333C7.94798 5.83333 7.83286 5.77163 7.75861 5.64823C7.68436 5.52484 7.67768 5.38835 7.73857 5.23877C7.94264 4.78578 8.24606 4.42441 8.64884 4.15465C9.05161 3.88488 9.50194 3.75 9.9998 3.75C10.6985 3.75 11.2899 3.98772 11.7738 4.46315C12.2578 4.93856 12.4998 5.52029 12.4998 6.20833C12.4998 6.89636 12.3054 7.45993 11.9165 7.89904C11.5276 8.33814 11.0276 8.60683 10.4165 8.70513V10L17.7434 15.5032C17.9026 15.6218 17.9517 15.7759 17.8908 15.9655C17.8299 16.1552 17.6996 16.25 17.4998 16.25H2.4998ZM3.7498 15.4167H16.2498L9.9998 10.7212L3.7498 15.4167Z\\\" fill=\\\"#868BC3\\\"/>\\r\\n</g>\\r\\n</svg>", State.ENABLED)

    );

    public final  static List<Product> PRODUCT_LIST = Arrays.asList(
            PRODUCT, PRODUCT, PRODUCT
    );
    public final static List<CategoryDTO> CATEGORY_DTO_EMPTY_LIST = Collections.emptyList();



}