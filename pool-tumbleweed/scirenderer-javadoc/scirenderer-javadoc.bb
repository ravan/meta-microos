SUMMARY = "Javadoc for scirenderer"
DESCRIPTION = "This package contains the documentation for SciRenderer."
LICENSE = "CECILL-2.0"

PV = "1.1.0"

RPM_NAME = "scirenderer-javadoc-1.1.0-8.5.noarch.rpm"
RPM_HASH = "d0a2cca571af2b75ed0d6c973b7af43f59215abf57cebfee75d8c5149db3a25b734b9d71548977cac1fe2dba84d8a40855eda65e48a83c432415c841d8bfce5a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "scirenderer-javadoc"

RDEPENDS:${PN} += ""

inherit rpm
