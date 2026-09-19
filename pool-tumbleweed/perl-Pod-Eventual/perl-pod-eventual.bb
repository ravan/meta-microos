SUMMARY = "Read a POD document as a series of trivial events"
DESCRIPTION = "POD is a pretty simple format to write, but it can be a big pain to deal \
with reading it and doing anything useful with it. Most existing POD \
parsers care about semantics, like whether a '=item' occurred after an \
'=over' but before a 'back', figuring out how to link a 'L<>', and other \
things like that. \
 \
Pod::Eventual is much less ambitious and much more stupid. Fortunately, \
stupid is often better. (That's what I keep telling myself, anyway.) \
 \
Pod::Eventual reads line-based input and produces events describing each \
POD paragraph or directive it finds. Once complete events are immediately \
passed to the 'handle_event' method. This method should be implemented by \
Pod::Eventual subclasses. If it isn't, Pod::Eventual's own 'handle_event' \
will be called, and will raise an exception."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.094003"

RPM_NAME = "perl-Pod-Eventual-0.094003-1.18.noarch.rpm"
RPM_HASH = "60b559a4255855e66ff73b3730fdf83ba5338a57f00fb4182904f99cc43495a42ffe01df183b01e613aae94e2b38412c128b4f555f09214891a16f0540bce165"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Pod--Eventual \
perl-Pod--Eventual--Simple \
perl-Pod-Eventual"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Mixin--Linewise--Readers"

inherit rpm
