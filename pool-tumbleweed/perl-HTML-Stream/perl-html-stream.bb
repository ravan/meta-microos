SUMMARY = "HTML output stream class, and some markup utilities"
DESCRIPTION = "The *HTML::Stream* module provides you with an object-oriented (and \
subclassable) way of outputting HTML. Basically, you open up an 'HTML \
stream' on an existing filehandle, and then do all of your output to the \
HTML stream. You can intermix HTML-stream-output and ordinary-print-output, \
if you like. \
 \
There's even a small built-in subclass, *HTML::Stream::Latin1*, which can \
handle Latin-1 input right out of the box. But all in good time..."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "1.60"

RPM_NAME = "perl-HTML-Stream-1.60-1.35.noarch.rpm"
RPM_HASH = "427098ab45ae51750d0a416bbe2f5fd81bc15c5c78eee9cabf89e00e7f96a0ec5ab80608703f0eb572ce9e675d52c745835625b86b553b861369de39eaa3bc13"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-HTML--Stream \
perl-HTML--Stream--FileHandle \
perl-HTML--Stream--Latin1 \
perl-HTML-Stream"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
