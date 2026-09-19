SUMMARY = "Lean & mean status/tabline for vim that's light as air."
DESCRIPTION = "When the plugin is correctly loaded, there will be a nice \
statusline at the bottom of each vim window."
LICENSE = "MIT"

PV = "0.11"

RPM_NAME = "vim-plugin-airline-0.11-64.2.noarch.rpm"
RPM_HASH = "eb4968e79358b9c2047ae3bce423db4989b55b7c668e67cb62b8b900d59d0fe4688810a6f6fc80360648da79d7df639817499a989c59887af92294cf90b06e93"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "vim-plugin-airline"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
