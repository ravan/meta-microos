SUMMARY = "Wrapper around WeeChat's FIFO pipe"
DESCRIPTION = "Conveniently send text and commands from file or standard input to WeeChat with this wrapper around WeeChat's FIFO pipe"
LICENSE = "MIT"

PV = "0.2.0"

RPM_NAME = "inwee-0.2.0-1.18.noarch.rpm"
RPM_HASH = "58dcddff19896c8a12432ae2a43240076a0a255945af6c0c487f284988eb90c876ec865fa41a39d5114fa671ce32e108c1107c7ca137d8a069aebe3ef81f86a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "inwee"

RDEPENDS:${PN} += "/usr/bin/sh \
weechat"

inherit rpm
