SUMMARY = "Conch for Twisted"
DESCRIPTION = "Twisted is an extensible framework for Python programming, with special focus \
on event-based network programming and multiprotocol integration. \
 \
Twisted Conch: The Twisted Shell. Terminal emulation, SSHv2 and telnet."
LICENSE = "MIT"

PV = "26.4.0"

RPM_NAME = "python314-Twisted-conch-26.4.0-3.3.noarch.rpm"
RPM_HASH = "f36df8d8ae55aa2726bef82ddbe6b87b87ad234d19476fbf213a7611d93cd4827df7282204a7edcbcc1bddcc5db194e40cee177a2e07e5bb04316509d1a430b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python314-Twisted-conch"

RDEPENDS:${PN} += "python314-Twisted \
python314-appdirs \
python314-bcrypt \
python314-cryptography"

inherit rpm
