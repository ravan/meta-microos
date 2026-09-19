SUMMARY = "Extra translations for Firefox ESR"
DESCRIPTION = "This package contains rarely used languages for the user interface \
of Firefox ESR."
LICENSE = "MPL-2.0"

PV = "153.2.0"

RPM_NAME = "firefox-esr-translations-other-153.2.0-1.1.aarch64.rpm"
RPM_HASH = "d9a2416875ee59b5358ee569e48ea3620d3447f648648d340ce14fcb3f9ab3c41d12d0a8561189484fbd8f6f8418d574b4dc6d9cb737451c7fda4b358806634f"

RPROVIDES:${PN} += "firefox-esr-translations-other \
locale-firefox-esr-ach;af;an;ast;az;be;bg;bn;br;bs;cak;cy;dsb;en-CA;eo;es-MX;et;eu;fa;ff;fy-NL;ga-IE;gd;gl;gn;gu-IN;he;hi-IN;hr;hsb;hy-AM;ia;id;is;ka;kab;kk;km;kn;lij;lt;lv;mk;mr;ms;my;ne-NP;nn-NO;oc;pa-IN;rm;ro;si;sk;sl;son;sq;sr;ta;te;th;tr;uk;ur;uz;vi;xh"

RDEPENDS:${PN} += "firefox-esr"

inherit rpm
