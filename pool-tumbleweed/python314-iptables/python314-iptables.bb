SUMMARY = "Python bindings for iptables"
DESCRIPTION = "Python-iptables is a Python project that provides bindings to the iptables C libraries in Linux. \
Interoperability with iptables is achieved using the iptables C libraries (libiptc, libxtables, \
and iptables extensions), not calling the iptables executable and parsing its output as most other \
iptables wrapper libraries do; this makes python-iptables faster and not prone to parsing errors, \
at the same time leveraging all available iptables match and target extensions without further work."
LICENSE = "Apache-2.0"

PV = "1.2.0"

RPM_NAME = "python314-iptables-1.2.0-1.1.aarch64.rpm"
RPM_HASH = "aa4b1237356f02240780ca33d71654950b3617fade0073ae7ed892e439b320228727b9310a3ea29fe75db6ffd5153b3a9992c9b5b54b4fdd8d8526889846f633"

RPROVIDES:${PN} += "libxtwrapper.cpython-314-aarch64-linux-gnu.so \
python3.14dist-python-iptables \
python314-iptables \
python3dist-python-iptables"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
