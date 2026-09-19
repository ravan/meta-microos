SUMMARY = "WebSocket client and server library for Python"
DESCRIPTION = "Python library providing an implementation of the WebSocket protocol \
defined in RFC 6455."
LICENSE = "BSD-3-Clause"

PV = "0.6.0"

RPM_NAME = "python314-ws4py-0.6.0-2.5.noarch.rpm"
RPM_HASH = "b8e2a23c3e0151b1d0f2fc49d80240465bd7b34d030fa0d335303f17d88054ff7ba8d303b53b267ada7bb6651ad24f447b97d566c26e7257c34bd49b833f3312"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-ws4py \
python314-ws4py \
python3dist-ws4py"

RDEPENDS:${PN} += "python-abi"

inherit rpm
