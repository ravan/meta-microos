SUMMARY = "Extra translations for Firefox"
DESCRIPTION = "This package contains rarely used languages for the user interface \
of Firefox."
LICENSE = "MPL-2.0"

PV = "154.0"

RPM_NAME = "MozillaFirefox-translations-other-154.0-1.2.aarch64.rpm"
RPM_HASH = "a7edfb915bfb3cf71cc530a3f10f6b1f577f5822d248c6cdfbae95a009f633ef187aedf09cf55f972b2d6b7f555910b3de1d042f02908602cb0f2f3b4c111ec1"

RPROVIDES:${PN} += "MozillaFirefox-translations-other \
locale-MozillaFirefox-ach;af;an;ast;az;be;bg;bn;br;bs;cak;cy;dsb;en-CA;eo;es-MX;et;eu;fa;ff;fy-NL;ga-IE;gd;gl;gn;gu-IN;he;hi-IN;hr;hsb;hy-AM;ia;id;is;ka;kab;kk;km;kn;lij;lt;lv;mk;mr;ms;my;ne-NP;nn-NO;oc;pa-IN;rm;ro;si;sk;sl;son;sq;sr;ta;te;th;tr;uk;ur;uz;vi;xh"

RDEPENDS:${PN} += "MozillaFirefox"

inherit rpm
