SUMMARY = "Find files using pretty C expressions"
DESCRIPTION = "Rawhide (rh(1)) lets you search for files on the command line using \
expressions and user-defined functions in a mini-language inspired \
by C. It's like find(1), but more fun to use. \
 \
Search criteria can be very readable and self-explanatory and/or \
very concise and typeable, and you can create your own lexicon of \
search terms. The output can include lots of detail, like ls(1). \
 \
You can search with file glob patterns and Perl-compatible regular \
expressions (regexes). You can search by name, path, symlink target \
path, body, access control list (ACL), extended attributes (EA), \
and all the usual file metadata (file type, permissions, owner, \
size, modification time, etc.)."
LICENSE = "GPL-3.0-or-later & BSD-3-Clause"

PV = "3.3"

RPM_NAME = "rawhide-3.3-2.11.aarch64.rpm"
RPM_HASH = "904315bd5b957e47c5f9bae47b3f8093f629c1f98e761c492bf7462c558246e3ffca6e2b5233d789d650c13a4ddefad2809e9a27a5a5a473b50ae0f335d36229"

RPROVIDES:${PN} += "config-rawhide \
rawhide"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libacl.so.1 \
libc.so.6 \
libmagic.so.1 \
libpcre2-8.so.0"

inherit rpm
