SUMMARY = "The openQA documentation"
DESCRIPTION = "Documentation material covering installation, configuration, basic test writing, etc. \
Covering both openQA and also os-autoinst test engine."
LICENSE = "GPL-2.0-or-later"

PV = "5.1788605562.29b45941"

RPM_NAME = "openQA-doc-5.1788605562.29b45941-1.1.aarch64.rpm"
RPM_HASH = "af7e51aaddfba080af8219e1254bf5172e412037a53f83a95082b10582d313512006fe16f2a94740e516654bb6e0cc01e0afb300bff35b67ac4a63d387c485d0"

RPROVIDES:${PN} += "openQA-doc"

RDEPENDS:${PN} += ""

inherit rpm
