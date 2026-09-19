SUMMARY = "OpenAMP communication APIs"
DESCRIPTION = "The OpenAMP framework provides software components that enable development \
of software applications for Asymmetric Multiprocessing (AMP) systems. \
The framework provides the following key capabilities. \
 \
1. Provides Life Cycle Management, and Inter Processor Communication \
   capabilities for management of remote compute resources and their associated \
   software contexts. \
2. Provides a stand alone library usable with RTOS and Baremetal software \
   environments \
3. Compatibility with upstream Linux remoteproc and rpmsg components \
4. Following AMP configurations supported \
	a. Linux master/Generic(Baremetal) remote \
	b. Generic(Baremetal) master/Linux remote \
5. Proxy infrastructure and supplied demos showcase ability of proxy on master \
   to handle printf, scanf, open, close, read, write calls from Bare metal \
   based remote contexts."
LICENSE = "BSD-3-Clause"

PV = "2020.01"

RPM_NAME = "libopen_amp0-2020.01-2.9.aarch64.rpm"
RPM_HASH = "4dcca2d41b94037eea96eb12e42a225ed6ea2101a0c635f9cb994109c043563fb2bb4b3571e83436b52eda94d477a55c9700af914d764dd1a0cf14a1696d569f"

RPROVIDES:${PN} += "libopen-amp.so.0 \
libopen-amp0 \
openamp"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libmetal.so.1"

inherit rpm
