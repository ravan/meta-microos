SUMMARY = "Definition of MIME types"
DESCRIPTION = "'MIME Type' is the old name for 'Media Type'. This module dates from 1999, \
and name changes are painful, so we stuck with the original name. \
 \
Media types are used in many applications (for instance as part of e-mail \
and HTTP traffic) to indicate the type of content which is transmitted. or \
expected. Read at https://www.rfc-editor.org/rfc/rfc6838 (registrations) \
and at https://www.rfc-editor.org/rfc/rfc9694 (top-levels) for the \
specification. \
 \
Sometimes detailed knowledge about a mime-type is need, however this module \
only knows about the file-name extensions which relate to some filetype. It \
can also be used to produce the right format: types which are not \
registered at IANA need to use 'x-' prefixes. \
 \
This object administers a huge list of known mime-types, combined from \
various sources. For instance, it contains *all IANA* types and the \
knowledge of Apache. Probably the most complete table on the net!"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "2.300.0"

RPM_NAME = "perl-MIME-Types-2.300.0-1.5.noarch.rpm"
RPM_HASH = "8c2ba7062c4c1f68334e498675d7ed6bb63857e29508539c5312cbcf0fca5bc4cee6097eecc40b58cef3a639905b6bb1d8a23e05753f95b278dd79affa546ba3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-MIME--Type \
perl-MIME--Types \
perl-MIME-Types \
perl-MojoX--MIME--Types"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
