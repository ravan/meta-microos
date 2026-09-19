SUMMARY = "Checks to see if the module can be loaded"
DESCRIPTION = "Test::Requires checks to see if the module can be loaded. \
 \
If this fails rather than failing tests this *skips all tests*. \
 \
Test::Requires can also be used to require a minimum version of Perl: \
 \
    use Test::Requires '5.010';  # quoting is necessary!! \
 \
     \
    use Test::Requires 'v5.10';"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.110.0"

RPM_NAME = "perl-Test-Requires-0.110.0-1.5.noarch.rpm"
RPM_HASH = "bb821dbb68f71eac4dcb6163f736ec0b7a97fbbfa7658108a39f568a0898ffe3ca5fdb9b540f0956332502cabab75f132d63647b67c137b01a674cbef281961b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--Requires \
perl-Test-Requires"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
