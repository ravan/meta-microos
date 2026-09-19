SUMMARY = "Friendly state machines for python"
DESCRIPTION = "Friendly state machines for python."
LICENSE = "Apache-2.0"

PV = "3.5.0"

RPM_NAME = "python313-automaton-3.5.0-1.1.noarch.rpm"
RPM_HASH = "5a9821eec297861933c07b2ebe76560c2ecb617ea9951f50575c5ce03ced2edfc4a1ec1c801b032d30578d78e0045431ff2bf8d82f0bcf0e207e02d7592036e3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-automaton \
python3.13dist-automaton \
python313-automaton \
python3dist-automaton"

RDEPENDS:${PN} += "python-abi \
python313-PrettyTable \
python313-pbr \
python313-typing-extensions"

inherit rpm
