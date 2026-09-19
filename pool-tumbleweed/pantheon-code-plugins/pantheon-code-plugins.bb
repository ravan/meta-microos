SUMMARY = "A collection of plugins for pantheon-code"
DESCRIPTION = "Extensible Text Editor for the Pantheon Desktop. \
 \
This package contains a collection of plugins: Contractor, Folder-Manager, \
Outline, Pastebin and etc."
LICENSE = "GPL-3.0-or-later"

PV = "8.3.2"

RPM_NAME = "pantheon-code-plugins-8.3.2-1.1.aarch64.rpm"
RPM_HASH = "a933a172a5508ecabe0b61269359d0eb24401e27939ded0b2d31776e6df61811964dcb7b1d3acddf1ae01b5b1947db6e919078819986872e213b707974a5d339"

RPROVIDES:${PN} += "libbrackets-completion.so \
libdetect-indent.so \
libeditorconfig.so \
libfuzzy-search.so \
libhighlight-word-selection.so \
libmarkdown-actions.so \
libpastebin.so \
libpreserve-indent.so \
libspell.so \
libvim-emulation.so \
libword-completion.so \
pantheon-code-plugins"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcodecore.so.0 \
libeditorconfig.so.0 \
libgdk-3.so.0 \
libgee-0.8.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgranite.so.6 \
libgtk-3.so.0 \
libgtksourceview-4.so.0 \
libgtkspell3-3.so.0 \
libpeas-2.so.0 \
libsoup-3.0.so.0 \
pantheon-code"

inherit rpm
