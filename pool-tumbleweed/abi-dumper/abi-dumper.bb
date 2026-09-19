SUMMARY = "Tool to dump ABI of an ELF object containing DWARF debug info"
DESCRIPTION = "The tool is intended to be used with ABI Compliance Checker tool for tracking \
ABI changes of a C/C++ library or kernel module."
LICENSE = "LGPL-2.1-or-later"

PV = "1.4"

RPM_NAME = "abi-dumper-1.4-1.6.noarch.rpm"
RPM_HASH = "8188c482ed4f49d9b732a196a14c9b4cf5468eb3281ec9333d519948f22715c4e09a1ae806d179b4cd188087c98d85e19b4e78d800c3d446b8b57c28d686280f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "abi-dumper"

RDEPENDS:${PN} += "/usr/bin/perl \
binutils \
elfutils \
gcc-c++ \
perl-Storable \
vtable-dumper"

inherit rpm
