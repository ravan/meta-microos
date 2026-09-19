SUMMARY = "Data files for hollywood"
DESCRIPTION = "Data files needed for the 'hollywood' package."
LICENSE = "CC0-1.0"

PV = "1.25"

RPM_NAME = "hollywood-data-1.25-1.2.noarch.rpm"
RPM_HASH = "1be35c2367a0cc80ab8b0734895de6167b7a2efff7299f2efdf53ea29e94d153d2286e875e4722d2118e5317e97485be9627601baac34befa6db25bdcca1ec6b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hollywood-data"

RDEPENDS:${PN} += ""

inherit rpm
