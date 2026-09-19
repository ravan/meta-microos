SUMMARY = "Python bindings for iptables"
DESCRIPTION = "Python-iptables is a Python project that provides bindings to the iptables C libraries in Linux. \
Interoperability with iptables is achieved using the iptables C libraries (libiptc, libxtables, \
and iptables extensions), not calling the iptables executable and parsing its output as most other \
iptables wrapper libraries do; this makes python-iptables faster and not prone to parsing errors, \
at the same time leveraging all available iptables match and target extensions without further work."
LICENSE = "Apache-2.0"

PV = "1.2.0"

RPM_NAME = "python313-iptables-1.2.0-1.1.aarch64.rpm"
RPM_HASH = "dcd3815d382b43a606892262ba8a78ad6f9bd5a0a3ed23ead407a887508e6f18aa32fcfb33da63108a31df01d700358552db695456551c8a024165a4099d304d"

RPROVIDES:${PN} += "libxtwrapper.cpython-313-aarch64-linux-gnu.so \
python3-iptables \
python3.13dist-python-iptables \
python313-iptables \
python3dist-python-iptables"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
