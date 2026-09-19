SUMMARY = "LuaDoc-compatible documentation generation system"
DESCRIPTION = "LDoc is a LuaDoc-compatible documentation generator which can \
also process C extension source. Markdown may be optionally used \
to render comments, as well as integrated readme documentation \
and pretty-printed example files."
LICENSE = "MIT"

PV = "1.4.6"

RPM_NAME = "lua54-ldoc-1.4.6-9.3.noarch.rpm"
RPM_HASH = "e75b855a47a465393af1cc1dabc2cdacd15745cb7038c3b798a6aa949ff3fab68148700881f15398b7211ed2af1494f2929c97951196ad73537a0422466b6e99"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua-ldoc \
lua54-ldoc"

RDEPENDS:${PN} += "lua54"

inherit rpm
