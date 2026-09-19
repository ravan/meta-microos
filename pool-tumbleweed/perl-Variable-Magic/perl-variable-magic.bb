SUMMARY = "Associate user-defined magic to variables from Perl"
DESCRIPTION = "Magic is Perl's way of enhancing variables. This mechanism lets the user \
add extra data to any variable and hook syntactical operations (such as \
access, assignment or destruction) that can be applied to it. With this \
module, you can add your own magic to any variable without having to write \
a single line of XS. \
 \
You'll realize that these magic variables look a lot like tied variables. \
It is not surprising, as tied variables are implemented as a special kind \
of magic, just like any 'irregular' Perl variable : scalars like '$!', '$(' \
or '$^W', the '%ENV' and '%SIG' hashes, the '@ISA' array, 'vec()' and \
'substr()' lvalues, threads::shared variables... They all share the same \
underlying C API, and this module gives you direct access to it."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.650.0"

RPM_NAME = "perl-Variable-Magic-0.650.0-1.1.aarch64.rpm"
RPM_HASH = "fcbc658b50e8c40c8844210b0c7d497a22427c9defd4672680ee60e806678ff3af352b827c4476e25125a64c65638ecb5e4cc709f7196288da324f195bf347ee"

RPROVIDES:${PN} += "perl-Variable--Magic \
perl-Variable-Magic"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.44.0"

inherit rpm
