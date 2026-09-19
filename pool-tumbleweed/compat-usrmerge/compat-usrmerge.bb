SUMMARY = "UsrMerge related scripts"
DESCRIPTION = "Scripts and data files related to UsrMerge \
(https://en.opensuse.org/openSUSE:Usr_merge). Normally not needd."
LICENSE = "MIT"

PV = "84.87"

RPM_NAME = "compat-usrmerge-84.87-5.29.aarch64.rpm"
RPM_HASH = "ae62246f74b98a0f13655ffa807dff798ea14e0dd6d0435a135d41b10054415f6d819b704a08495c15fbc37f2146659ba4f061f45c9c894b21bab88b2883f4f7"

RPROVIDES:${PN} += "compat-usrmerge \
rpm-lua-usrmerge \
rpm-lua-usrmerge-files"

RDEPENDS:${PN} += ""

inherit rpm
