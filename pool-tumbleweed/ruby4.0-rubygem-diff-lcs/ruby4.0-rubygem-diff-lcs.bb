SUMMARY = "Diff::LCS computes the difference between two Enumerable sequences"
DESCRIPTION = "Diff::LCS computes the difference between two Enumerable sequences using the \
McIlroy-Hunt longest common subsequence (LCS) algorithm. It includes utilities \
to create a simple HTML diff output format and a standard diff-like tool. \
This is release 1.4.3, providing a simple extension that allows for \
Diff::LCS::Change objects to be treated implicitly as arrays and fixes a \
number of formatting issues. \
Ruby versions below 2.5 are soft-deprecated, which means that older versions \
are no longer part of the CI test suite. If any changes have been introduced \
that break those versions, bug reports and patches will be accepted, but it \
will be up to the reporter to verify any fixes prior to release. The next \
major release will completely break compatibility."
LICENSE = "Artistic-2.0 & MIT & GPL-2.0-only"

PV = "1.5.0"

RPM_NAME = "ruby4.0-rubygem-diff-lcs-1.5.0-3.3.aarch64.rpm"
RPM_HASH = "81cc194f193c934575225c2aa3abc7b3ec92511cd73cb12ad484077aada6d0717b42db164e29acb7678941abf35162c57c748bb2c737b3601e57b69e1ee5a22d"

RPROVIDES:${PN} += "ruby4.0-rubygem-diff-lcs \
rubygem-diff-lcs \
rubygem-ruby-4.0.0-diff-lcs \
rubygem-ruby-4.0.0-diff-lcs-1 \
rubygem-ruby-4.0.0-diff-lcs-1.5 \
rubygem-ruby-4.0.0-diff-lcs-1.5.0"

RDEPENDS:${PN} += "/usr/bin/ruby.ruby4.0 \
alts \
ruby-abi"

inherit rpm
