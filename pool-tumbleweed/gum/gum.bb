SUMMARY = "Tool for glamorous shell scripts"
DESCRIPTION = "Gum leverages the power of Bubbles and Lip Gloss in your scripts and aliases."
LICENSE = "MIT"

PV = "0.16.0"

RPM_NAME = "gum-0.16.0-1.8.aarch64.rpm"
RPM_HASH = "e9f0ab6d8e651bed7aa5ad5016f7d61f2ea84d84996e30aa7a996dcd7bc440e1121e35fa48eef13f9847a840e7f022a2b6006ae2e8d1f564b9e9ecb5b4bed668"

RPROVIDES:${PN} += "gum"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
