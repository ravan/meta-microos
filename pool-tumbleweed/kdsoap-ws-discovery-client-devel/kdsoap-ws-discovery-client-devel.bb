SUMMARY = "Development files for kdsoap-ws-discovery-client"
DESCRIPTION = "Development files for kdsoap-ws-discovery-client, a client for the \
WS-discovery protocol."
LICENSE = "GPL-3.0-or-later"

PV = "0.4.0"

RPM_NAME = "kdsoap-ws-discovery-client-devel-0.4.0-1.6.aarch64.rpm"
RPM_HASH = "c2720a3994590af0c704af12b5e0a982c09906a9d5a1b14837ff6bfa3c3ff0565115875793bfc44738287520070fcbd4c7a3bcc493de54a81cd43ba5ed14ff75"

RPROVIDES:${PN} += "cmake-KDSoapWSDiscoveryClient \
kdsoap-ws-discovery-client-devel"

RDEPENDS:${PN} += "cmake-KDSoap-qt6 \
libKDSoapWSDiscoveryClient0"

inherit rpm
