SUMMARY = "PPDs for HP printers (PostScript)"
DESCRIPTION = "This package provides printer setup support for HP PostScript printers that need no \
CUPS filter. \
 \
This package is not necessary for operation of already configured devices."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later & MIT"

PV = "3.26.4"

RPM_NAME = "hplip-ppds-postscript-3.26.4-2.2.noarch.rpm"
RPM_HASH = "a4a53a53e2d42bbb6581ae6012a04c2efaebd6c30f0d5e9795b7e1ce67ab9e1756bf9b9c3210abbaa109f89bbaa49f82625aa2e476db36a8954108bc04a6348e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hplip-ppds-postscript \
postscriptdriver-hewlett-packard;hp-color-laserjet-2500-series; \
postscriptdriver-hewlett-packard;hp-color-laserjet-2500; \
postscriptdriver-hewlett-packard;hp-color-laserjet-2550; \
postscriptdriver-hewlett-packard;hp-color-laserjet-2605; \
postscriptdriver-hewlett-packard;hp-color-laserjet-2605dn; \
postscriptdriver-hewlett-packard;hp-color-laserjet-2605dtn; \
postscriptdriver-hewlett-packard;hp-color-laserjet-2700; \
postscriptdriver-hewlett-packard;hp-color-laserjet-2700n; \
postscriptdriver-hewlett-packard;hp-color-laserjet-2800; \
postscriptdriver-hewlett-packard;hp-color-laserjet-2820; \
postscriptdriver-hewlett-packard;hp-color-laserjet-2830; \
postscriptdriver-hewlett-packard;hp-color-laserjet-2840; \
postscriptdriver-hewlett-packard;hp-color-laserjet-3700; \
postscriptdriver-hewlett-packard;hp-color-laserjet-3700n; \
postscriptdriver-hewlett-packard;hp-color-laserjet-4500; \
postscriptdriver-hewlett-packard;hp-color-laserjet-4550; \
postscriptdriver-hewlett-packard;hp-color-laserjet-4600-series; \
postscriptdriver-hewlett-packard;hp-color-laserjet-4600; \
postscriptdriver-hewlett-packard;hp-color-laserjet-4610; \
postscriptdriver-hewlett-packard;hp-color-laserjet-4650; \
postscriptdriver-hewlett-packard;hp-color-laserjet-5500; \
postscriptdriver-hewlett-packard;hp-color-laserjet-5m; \
postscriptdriver-hewlett-packard;hp-color-laserjet-8500; \
postscriptdriver-hewlett-packard;hp-color-laserjet-8550; \
postscriptdriver-hewlett-packard;hp-color-laserjet-9500; \
postscriptdriver-hewlett-packard;hp-color-laserjet-cm1015; \
postscriptdriver-hewlett-packard;hp-color-laserjet-cm1017; \
postscriptdriver-hewlett-packard;hp-color-laserjet-cp4005; \
postscriptdriver-hewlett-packard;hp-designjet-4000ps; \
postscriptdriver-hewlett-packard;hp-designjet-4020ps; \
postscriptdriver-hewlett-packard;hp-designjet-4500mfp; \
postscriptdriver-hewlett-packard;hp-designjet-4500ps; \
postscriptdriver-hewlett-packard;hp-designjet-4520mfp; \
postscriptdriver-hewlett-packard;hp-designjet-4520ps; \
postscriptdriver-hewlett-packard;hp-designjet-d5800ps-photo; \
postscriptdriver-hewlett-packard;hp-designjet-t1100ps-24in; \
postscriptdriver-hewlett-packard;hp-designjet-t1100ps-44in; \
postscriptdriver-hewlett-packard;hp-designjet-t1120ps-24in; \
postscriptdriver-hewlett-packard;hp-designjet-t1120ps-44in; \
postscriptdriver-hewlett-packard;hp-designjet-t1200-postscript; \
postscriptdriver-hewlett-packard;hp-designjet-t1300-postscript; \
postscriptdriver-hewlett-packard;hp-designjet-t1500-postscript; \
postscriptdriver-hewlett-packard;hp-designjet-t2300-postscript; \
postscriptdriver-hewlett-packard;hp-designjet-t2500-postscript; \
postscriptdriver-hewlett-packard;hp-designjet-t7100ps-monochrome; \
postscriptdriver-hewlett-packard;hp-designjet-t7100ps; \
postscriptdriver-hewlett-packard;hp-designjet-t7200ps; \
postscriptdriver-hewlett-packard;hp-designjet-t770-postscript; \
postscriptdriver-hewlett-packard;hp-designjet-t770ps-24in; \
postscriptdriver-hewlett-packard;hp-designjet-t790ps-24in; \
postscriptdriver-hewlett-packard;hp-designjet-t790ps-44in; \
postscriptdriver-hewlett-packard;hp-designjet-t795ps-44in; \
postscriptdriver-hewlett-packard;hp-designjet-z2600-postscript; \
postscriptdriver-hewlett-packard;hp-designjet-z5400-postscript; \
postscriptdriver-hewlett-packard;hp-designjet-z5600-postscript; \
postscriptdriver-hewlett-packard;hp-designjet-z6-pro-64in-ps; \
postscriptdriver-hewlett-packard;hp-designjet-z6100ps-42in-photo; \
postscriptdriver-hewlett-packard;hp-designjet-z6100ps-60in-photo; \
postscriptdriver-hewlett-packard;hp-designjet-z6200ps-42in-photo; \
postscriptdriver-hewlett-packard;hp-designjet-z6200ps-60in-photo; \
postscriptdriver-hewlett-packard;hp-designjet-z6600ps; \
postscriptdriver-hewlett-packard;hp-designjet-z6610ps-60in; \
postscriptdriver-hewlett-packard;hp-designjet-z6800ps-photo; \
postscriptdriver-hewlett-packard;hp-designjet-z6810ps-42in; \
postscriptdriver-hewlett-packard;hp-designjet-z6810ps-60in; \
postscriptdriver-hewlett-packard;hp-designjet-z9-24in; \
postscriptdriver-hewlett-packard;hp-designjet-z9-44in; \
postscriptdriver-hewlett-packard;hp-designjet-z9-pro-64in-ps; \
postscriptdriver-hewlett-packard;hp-designjet-z9dr-44in; \
postscriptdriver-hewlett-packard;hp-laserjet-1200; \
postscriptdriver-hewlett-packard;hp-laserjet-1200n; \
postscriptdriver-hewlett-packard;hp-laserjet-1220; \
postscriptdriver-hewlett-packard;hp-laserjet-1220se; \
postscriptdriver-hewlett-packard;hp-laserjet-1300; \
postscriptdriver-hewlett-packard;hp-laserjet-1300n; \
postscriptdriver-hewlett-packard;hp-laserjet-1300xi; \
postscriptdriver-hewlett-packard;hp-laserjet-1320-series; \
postscriptdriver-hewlett-packard;hp-laserjet-1320; \
postscriptdriver-hewlett-packard;hp-laserjet-1320n; \
postscriptdriver-hewlett-packard;hp-laserjet-1320nw; \
postscriptdriver-hewlett-packard;hp-laserjet-1320tn; \
postscriptdriver-hewlett-packard;hp-laserjet-2100-series; \
postscriptdriver-hewlett-packard;hp-laserjet-2100; \
postscriptdriver-hewlett-packard;hp-laserjet-2200-series; \
postscriptdriver-hewlett-packard;hp-laserjet-2200; \
postscriptdriver-hewlett-packard;hp-laserjet-2300-series; \
postscriptdriver-hewlett-packard;hp-laserjet-2300; \
postscriptdriver-hewlett-packard;hp-laserjet-2410; \
postscriptdriver-hewlett-packard;hp-laserjet-2420; \
postscriptdriver-hewlett-packard;hp-laserjet-2430; \
postscriptdriver-hewlett-packard;hp-laserjet-3015; \
postscriptdriver-hewlett-packard;hp-laserjet-3020; \
postscriptdriver-hewlett-packard;hp-laserjet-3030; \
postscriptdriver-hewlett-packard;hp-laserjet-3050; \
postscriptdriver-hewlett-packard;hp-laserjet-3052; \
postscriptdriver-hewlett-packard;hp-laserjet-3200m; \
postscriptdriver-hewlett-packard;hp-laserjet-3300-3310-3320; \
postscriptdriver-hewlett-packard;hp-laserjet-3380; \
postscriptdriver-hewlett-packard;hp-laserjet-3390; \
postscriptdriver-hewlett-packard;hp-laserjet-4-plus; \
postscriptdriver-hewlett-packard;hp-laserjet-4000-series; \
postscriptdriver-hewlett-packard;hp-laserjet-4050-series; \
postscriptdriver-hewlett-packard;hp-laserjet-4100-mfp; \
postscriptdriver-hewlett-packard;hp-laserjet-4100-series; \
postscriptdriver-hewlett-packard;hp-laserjet-4200; \
postscriptdriver-hewlett-packard;hp-laserjet-4240; \
postscriptdriver-hewlett-packard;hp-laserjet-4250; \
postscriptdriver-hewlett-packard;hp-laserjet-4300; \
postscriptdriver-hewlett-packard;hp-laserjet-4350; \
postscriptdriver-hewlett-packard;hp-laserjet-4ml; \
postscriptdriver-hewlett-packard;hp-laserjet-4mp; \
postscriptdriver-hewlett-packard;hp-laserjet-4si; \
postscriptdriver-hewlett-packard;hp-laserjet-4v; \
postscriptdriver-hewlett-packard;hp-laserjet-5000-series; \
postscriptdriver-hewlett-packard;hp-laserjet-5000; \
postscriptdriver-hewlett-packard;hp-laserjet-5100-series; \
postscriptdriver-hewlett-packard;hp-laserjet-5200; \
postscriptdriver-hewlett-packard;hp-laserjet-5200l; \
postscriptdriver-hewlett-packard;hp-laserjet-5200lx; \
postscriptdriver-hewlett-packard;hp-laserjet-5mp; \
postscriptdriver-hewlett-packard;hp-laserjet-5p; \
postscriptdriver-hewlett-packard;hp-laserjet-5si-mopier; \
postscriptdriver-hewlett-packard;hp-laserjet-5si; \
postscriptdriver-hewlett-packard;hp-laserjet-6mp; \
postscriptdriver-hewlett-packard;hp-laserjet-6p; \
postscriptdriver-hewlett-packard;hp-laserjet-8000-series; \
postscriptdriver-hewlett-packard;hp-laserjet-8000; \
postscriptdriver-hewlett-packard;hp-laserjet-8100-mfp; \
postscriptdriver-hewlett-packard;hp-laserjet-8100-series; \
postscriptdriver-hewlett-packard;hp-laserjet-8150-mfp; \
postscriptdriver-hewlett-packard;hp-laserjet-9000-mfp; \
postscriptdriver-hewlett-packard;hp-laserjet-9000-series; \
postscriptdriver-hewlett-packard;hp-laserjet-9040-mfp; \
postscriptdriver-hewlett-packard;hp-laserjet-9040; \
postscriptdriver-hewlett-packard;hp-laserjet-9050-mfp; \
postscriptdriver-hewlett-packard;hp-laserjet-9050; \
postscriptdriver-hewlett-packard;hp-laserjet-9055mfp; \
postscriptdriver-hewlett-packard;hp-laserjet-9065mfp; \
postscriptdriver-hewlett-packard;hp-laserjet-m3027-mfp; \
postscriptdriver-hewlett-packard;hp-laserjet-m4349-mfp; \
postscriptdriver-hewlett-packard;hp-laserjet-m5025-mfp; \
postscriptdriver-hewlett-packard;hp-laserjet-p2015-series; \
postscriptdriver-hewlett-packard;hp-laserjet-p2055; \
postscriptdriver-hewlett-packard;hp-laserjet-p3004; \
postscriptdriver-hewlett-packard;hp-laserjet-p3005; \
postscriptdriver-hewlett-packard;hp-laserjet-p4014dn; \
postscriptdriver-hp;hp-business-inkjet-2250; \
postscriptdriver-hp;hp-business-inkjet-2280; \
postscriptdriver-hp;hp-business-inkjet-2300; \
postscriptdriver-hp;hp-business-inkjet-2600; \
postscriptdriver-hp;hp-business-inkjet-2800; \
postscriptdriver-hp;hp-business-inkjet-3000; \
postscriptdriver-hp;hp-pagewide-xl-4000ps-mfp; \
postscriptdriver-hp;hp-pagewide-xl-4000ps; \
postscriptdriver-hp;hp-pagewide-xl-4500ps-mfp; \
postscriptdriver-hp;hp-pagewide-xl-4500ps; \
postscriptdriver-hp;hp-pagewide-xl-5000ps-mfp; \
postscriptdriver-hp;hp-pagewide-xl-5000ps; \
postscriptdriver-hp;hp-pagewide-xl-5100ps-mfp; \
postscriptdriver-hp;hp-pagewide-xl-5100ps; \
postscriptdriver-hp;hp-pagewide-xl-6000ps-mfp; \
postscriptdriver-hp;hp-pagewide-xl-6000ps; \
postscriptdriver-hp;hp-pagewide-xl-8000ps; \
postscriptdriver-hp;hp-pagewide-xl-pro-5200-ps-mfp-series; \
postscriptdriver-hp;hp-pagewide-xl-pro-8200-ps-mfp-series; \
postscriptdriver-hp;hp2250; \
postscriptdriver-hp;hp2280; \
postscriptdriver-hp;hp2300; \
postscriptdriver-hp;hp2600; \
postscriptdriver-hp;hp3000;"

RDEPENDS:${PN} += ""

inherit rpm
