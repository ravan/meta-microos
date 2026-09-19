SUMMARY = "Tool to verify that your files are in harmony with your .editorconfig"
DESCRIPTION = "This is a tool to check if your files consider your .editorconfig rules. Most \
tools—like linters, for example—only test one filetype and need an extra \
configuration. This tool only needs your .editorconfig to check all files. \
 \
If you don't know about editorconfig already you can read about it here: \
editorconfig.org."
LICENSE = "MIT"

PV = "3.11.2"

RPM_NAME = "editorconfig-checker-3.11.2-1.1.aarch64.rpm"
RPM_HASH = "b1728a0b1641737f41161bbb45a4985012250c8754076ac2a305a30b1dd4f72dcfa4d84b300940af079d826354859eeaf441f973f33004066972487a7b0e7489"

RPROVIDES:${PN} += "ec \
editorconfig-checker"

RDEPENDS:${PN} += ""

inherit rpm
