SUMMARY = "Desktop Files Translations"
DESCRIPTION = "This package provides the translations for installed desktop files."
LICENSE = "MIT"

PV = "84.87.20241104.9505069"

RPM_NAME = "desktop-translations-84.87.20241104.9505069-1.6.noarch.rpm"
RPM_HASH = "c7b2db9e76fef47d17fcf0a82f757dad11093022cc13732a0bef1cd164890c61949a24bee327598d404481c749d08a1c89b2626e16823b1a2391872fb6b85b65"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "desktop-translations \
locale-af;ar;bg;be;bn;bs;ca;cs;cy;da;de;el;en-GB;eo;es;et;fi;fr;gl;gu;he;hi;hr;hu;id;it;ja;ka;kab;km;ko;lo;lt;mk;mr;nb;nl;pa;pl;pt;ro;ru;si;sk;sl;sr;sr@Latn;sv;ta;tr;uk;vi;wa;xh;zh-CN;zh-TW;zu"

RDEPENDS:${PN} += ""

inherit rpm
