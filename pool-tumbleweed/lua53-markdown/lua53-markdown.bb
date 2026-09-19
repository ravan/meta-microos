SUMMARY = "Markdown text-to-html markup system"
DESCRIPTION = "A pure-lua implementation of the Markdown text-to-html markup system."
LICENSE = "MIT"

PV = "0.331"

RPM_NAME = "lua53-markdown-0.331-6.3.noarch.rpm"
RPM_HASH = "44dd9115838b2bafe8f74c0e5b282cd260945bf99c6de87dec7684632d8de1f9903131c75bfd884c0828d85b56182d92bb8656de9bed1aaeb772fb2f4e262348"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua53-markdown"

RDEPENDS:${PN} += "lua53"

inherit rpm
