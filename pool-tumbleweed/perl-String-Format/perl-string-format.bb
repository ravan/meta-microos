SUMMARY = "Sprintf-Like String Formatting Capabilities With"
DESCRIPTION = "String::Format lets you define arbitrary printf-like format sequences to be \
expanded. This module would be most useful in configuration files and \
reporting tools, where the results of a query need to be formatted in a \
particular way. It was inspired by mutt's index_format and related \
directives (see \
<URL:http://www.mutt.org/doc/manual/manual-6.html#index_format>)."
LICENSE = "GPL-2.0-only"

PV = "1.18"

RPM_NAME = "perl-String-Format-1.18-1.33.noarch.rpm"
RPM_HASH = "2d1c6c862e1db22364fc393b21a795646adc316a42a6bbecdcb66e8fb8e46d34ea6b0380622d957019d100b474684c9c3fb74b131a65afe00dc4b6a6eded2b3a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-String--Format \
perl-String-Format"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
