SUMMARY = "Vim plugin for coccigrep"
DESCRIPTION = "A vim plugin to invoke coccigrep from vim."
LICENSE = "GPL-3.0-only"

PV = "1.21"

RPM_NAME = "coccigrep-vim-plugin-1.21-1.4.noarch.rpm"
RPM_HASH = "9837e68576e4cce862fd2558e2004afe0a9271607ddcb70e9a5f1e08174bf6e561fe93f98342cf73d06c6aba399ac26b089d0147ec7a71d96002f7e888e710ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "coccigrep-vim-plugin"

RDEPENDS:${PN} += "coccigrep"

inherit rpm
