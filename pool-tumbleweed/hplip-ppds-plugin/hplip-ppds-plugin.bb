SUMMARY = "PPDs for HP printers (proprietary plugin)"
DESCRIPTION = "This package provides printer setup support for HP printers that need the \
proprietary HPLIP plugin. Use the hp-plugin tool from the hplip-base package \
to install the plugin. \
 \
This package is not necessary for operation of already configured devices."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later & MIT"

PV = "3.26.4"

RPM_NAME = "hplip-ppds-plugin-3.26.4-2.2.noarch.rpm"
RPM_HASH = "74923612d1ba7a7635c335b2db8e42333b40882015af1027bb33779c7ec53eea526151eca53e6901c3a4a98d9d7f6f42bf249c0b0c66db71a7a5f3deff68b848"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hplip-ppds-plugin \
postscriptdriver-hewlett-packard;hp-color-laserjet-1600; \
postscriptdriver-hewlett-packard;hp-color-laserjet-2600n; \
postscriptdriver-hewlett-packard;hp-color-laserjet-3500; \
postscriptdriver-hewlett-packard;hp-color-laserjet-3500n; \
postscriptdriver-hewlett-packard;hp-color-laserjet-3550; \
postscriptdriver-hewlett-packard;hp-color-laserjet-3550n; \
postscriptdriver-hewlett-packard;hp-color-laserjet-3600; \
postscriptdriver-hewlett-packard;hp-color-laserjet-cp1215; \
postscriptdriver-hewlett-packard;hp-color-laserjet-pro-mfp-m176n; \
postscriptdriver-hewlett-packard;hp-laserjet-1000; \
postscriptdriver-hewlett-packard;hp-laserjet-1005-series; \
postscriptdriver-hewlett-packard;hp-laserjet-1018; \
postscriptdriver-hewlett-packard;hp-laserjet-1020; \
postscriptdriver-hewlett-packard;hp-laserjet-1022; \
postscriptdriver-hewlett-packard;hp-laserjet-1022n; \
postscriptdriver-hewlett-packard;hp-laserjet-1022nw; \
postscriptdriver-hewlett-packard;hp-laserjet-cp-1025nw; \
postscriptdriver-hewlett-packard;hp-laserjet-cp1025nw; \
postscriptdriver-hewlett-packard;hp-laserjet-m1005; \
postscriptdriver-hewlett-packard;hp-laserjet-m1120-mfp; \
postscriptdriver-hewlett-packard;hp-laserjet-m1120n-mfp; \
postscriptdriver-hewlett-packard;hp-laserjet-m1319f-mfp; \
postscriptdriver-hewlett-packard;hp-laserjet-p1005; \
postscriptdriver-hewlett-packard;hp-laserjet-p1006; \
postscriptdriver-hewlett-packard;hp-laserjet-p1007; \
postscriptdriver-hewlett-packard;hp-laserjet-p1008; \
postscriptdriver-hewlett-packard;hp-laserjet-p1505; \
postscriptdriver-hewlett-packard;hp-laserjet-p1505n; \
postscriptdriver-hewlett-packard;hp-laserjet-p2014; \
postscriptdriver-hewlett-packard;hp-laserjet-p2014n; \
postscriptdriver-hewlett-packard;hp-laserjet-p2035; \
postscriptdriver-hewlett-packard;hp-laserjet-p2035n; \
postscriptdriver-hewlett-packard;hp-laserjet-pro-mfp-m127fw; \
postscriptdriver-hewlett-packard;hp-laserjet-professional-m1217nfw-mfp; \
postscriptdriver-hewlett-packard;hp-laserjet-professional-p-1102w; \
postscriptdriver-hewlett-packard;hp-laserjet-professional-p1102; \
postscriptdriver-hewlett-packard;hp-laserjet-professional-p1566; \
postscriptdriver-hp;deskjet-2800-series; \
postscriptdriver-hp;deskjet-2900-series; \
postscriptdriver-hp;deskjet-4200-series; \
postscriptdriver-hp;deskjet-4300-series; \
postscriptdriver-hp;deskjet-4900-series; \
postscriptdriver-hp;deskjet-5100-series; \
postscriptdriver-hp;deskjet-5800-series;"

RDEPENDS:${PN} += "hplip-base \
hplip-cups"

inherit rpm
