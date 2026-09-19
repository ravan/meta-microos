SUMMARY = "Filter to put all characters() in one event"
DESCRIPTION = "This is a very simple filter. One common cause of grief (and programmer \
error) is that XML parsers aren't required to provide character events in \
one chunk. They can, but are not forced to, and most don't. This filter \
does the trivial but oft-repeated task of putting all characters into a \
single event. \
 \
Note that this won't help you cases such as: \
 \
  <foo> blah <!-- comment --> phubar </foo> \
 \
In the above case, given the interleaving comment, there will be two \
'character()' events. This may be worked around in the future if there is \
demand for it. \
 \
An interesting way to use this filter, instead of telling users to use it, \
is to return it from your handler's constructor, already configured and \
all. That'll make the buffering totally transparent to them \
('XML::SAX::Writer' does that)."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "1.01"

RPM_NAME = "perl-XML-Filter-BufferText-1.01-9.42.noarch.rpm"
RPM_HASH = "c44dd91a8f25d95e38fdc924edf875d947ca2b9e98abeea45190730e008abf8da5050fc72a89ca36d17142188499ef2896eb391c257d11f9f4592efd57f6f31c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-XML--Filter--BufferText \
perl-XML-Filter-BufferText"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-XML--SAX \
perl-XML--SAX--Base"

inherit rpm
