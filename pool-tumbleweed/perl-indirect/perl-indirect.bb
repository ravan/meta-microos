SUMMARY = "Lexically warn about using the indirect method call syntax"
DESCRIPTION = "When enabled, this pragma warns about indirect method calls that are \
present in your code. \
 \
The indirect syntax is now considered harmful, since its parsing has many \
quirks and its use is error prone : when the subroutine 'foo' has not been \
declared in the current package, 'foo $x' actually compiles to '$x->foo', \
and 'foo { key => 1 }' to ''key'->foo(1)'. Please refer to the REFERENCES \
section for a more complete list of reasons for avoiding this construct. \
 \
This pragma currently does not warn for core functions ('print', 'say', \
'exec' or 'system'). This may change in the future, or may be added as \
optional features that would be enabled by passing options to 'unimport'. \
 \
This module is *not* a source filter."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.39"

RPM_NAME = "perl-indirect-0.39-1.38.aarch64.rpm"
RPM_HASH = "9b4344b79d553e8f10a35c95f66ead83cfbabd7c1ae2e974ccb181ed5335e8ac4bd7a71eb91bf803984174c40732398f406ba51b05d92418c5df2b854fb7ad69"

RPROVIDES:${PN} += "perl-indirect"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.44.0"

inherit rpm
