SUMMARY = "Convert Grype vulnerability scan results into interactive HTML reports"
DESCRIPTION = "Convert Grype vulnerability scan results into interactive HTML reports."
LICENSE = "MIT"

PV = "0.0.1~1739230997.5f96631"

RPM_NAME = "python3-grype2html-0.0.1~1739230997.5f96631-1.6.noarch.rpm"
RPM_HASH = "f6fb7d6acf3cfc473a60887baba1542c83892517f5e793fa11380744c7e472c0363d223fb40504a696987ec238a225650d4604de765c4ff94d8812d7fa7add5b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-grype2html"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
grype \
update-alternatives"

inherit rpm
