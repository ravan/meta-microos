SUMMARY = "Persistent Memory Development Kit"
DESCRIPTION = "The Persistent Memory Development Kit (PMDK), formerly known as NVML \
(Non-Volatile Memory Library), is a collection of libraries and tools \
built on the DAX (Direct Access) feature of the Linux kernel which \
allows applications to access persistent memory as memory-mapped \
files, as described in the SNIA NVM Programming Model."
LICENSE = "BSD-3-Clause"

PV = "2.1.1"

RPM_NAME = "pmdk-2.1.1-1.5.aarch64.rpm"
RPM_HASH = "f44ee456279dda2d75cd30aa3b6793c7a49d13e129c56d9e942ab6354dffa3e94c84f314d18fbe8c4342312732086929474409f3e1982b5cfbccd057cfec6d4c"

RPROVIDES:${PN} += "nvml \
pmdk"

RDEPENDS:${PN} += ""

inherit rpm
