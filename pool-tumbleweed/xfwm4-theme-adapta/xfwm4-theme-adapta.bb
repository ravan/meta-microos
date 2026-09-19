SUMMARY = "Adapta Xfwm4 themes"
DESCRIPTION = "Adapta is a GTK+ theme based on Material Design Guidelines that was \
created based on the Flat-Plat theme. \
 \
This package contains the Xfwm4 themes."
LICENSE = "CC-BY-SA-4.0 & GPL-2.0-only"

PV = "3.95.0.11"

RPM_NAME = "xfwm4-theme-adapta-3.95.0.11-5.4.noarch.rpm"
RPM_HASH = "ddb063a2bc38e3e922581918e86b36ebff213c84b56c460247d34f0eef8f7426154a2ca8d5946d43345348be19d5f18cfaf340599094ce7edb5a12a4b5de29a3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xfwm4-theme-adapta"

RDEPENDS:${PN} += "metatheme-adapta-common \
xfwm4"

inherit rpm
