SUMMARY = "Documentation for python-debtcollector"
DESCRIPTION = "A collection of Python deprecation patterns and strategies that help \
you collect your technical debt in a non-destructive manner. The goal \
of this library is to provide well documented developer facing \
deprecation patterns that start of with a basic set and can expand \
into a larger set of patterns as time goes on. The desired output of \
these patterns is to apply the warnings module to emit \
DeprecationWarning or PendingDeprecationWarning or similar derivative \
to developers using libraries (or potentially applications) about \
future deprecations. \
 \
This package contains documentation in HTML format."
LICENSE = "Apache-2.0"

PV = "3.1.0"

RPM_NAME = "python-debtcollector-doc-3.1.0-2.2.noarch.rpm"
RPM_HASH = "3c23c0b2cff6bbf83089f33e1a2e30326f2e31d854a6f71bf7a9bb998d73cdf4988d633948074f64a23af50cb498afb6e2fb4126fd9645d52d1a07c671adc7e2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-debtcollector-doc"

RDEPENDS:${PN} += ""

inherit rpm
