SUMMARY = "Git for operating system binaries  -- GObject bindings"
DESCRIPTION = "OSTree is a tool for managing bootable, immutable, versioned \
filesystem trees. While it takes over some of the roles of tradtional \
'package managers' like dpkg and rpm, it is not a package system; nor \
is it a tool for managing full disk images. Instead, it sits between \
those levels, offering a blend of the advantages (and disadvantages) \
of both."
LICENSE = "LGPL-2.0-or-later"

PV = "2026.4"

RPM_NAME = "typelib-1_0-OSTree-1_0-2026.4-1.1.aarch64.rpm"
RPM_HASH = "f54b4d04eeb7949d6cc8f404bafbfa1a8f458f047ec08fed4699d90ff42661774c948ca4557fa7ae114e9030892f58b2133a03ddb9d544fffaa6a60377f7c2b5"

RPROVIDES:${PN} += "typelib-1-0-OSTree-1-0 \
typelib-OSTree"

RDEPENDS:${PN} += "libostree-1.so.1 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gio"

inherit rpm
