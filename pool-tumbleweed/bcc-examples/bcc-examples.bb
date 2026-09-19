SUMMARY = "Examples from the BPF Compiler Collection"
DESCRIPTION = "Python and C examples from the BPF Compiler Collection."
LICENSE = "Apache-2.0"

PV = "0.37.0"

RPM_NAME = "bcc-examples-0.37.0-4.1.noarch.rpm"
RPM_HASH = "2ae7aa51b69a2d0533a823555cedf40c8019c5e7b01e7dfe254d9bcb05d851cd0e652fbffb6748d2df909d709bdf9fd60536e758492f3223fc41dec61e2c8b5c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bcc-examples"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3 \
python3-bcc"

inherit rpm
