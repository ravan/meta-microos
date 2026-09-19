SUMMARY = "Patches text with given patch"
DESCRIPTION = "Text::Patch combines source text with given diff (difference) data. Diff \
data is produced by Text::Diff module or by the standard diff utility (man \
diff, see -u option). \
 \
* patch( $source, $diff, options... )"
LICENSE = "GPL-2.0-or-later"

PV = "1.800.0"

RPM_NAME = "perl-Text-Patch-1.800.0-1.9.noarch.rpm"
RPM_HASH = "010c56f10f942f2ab74bdb0f1d18dc1007903ab17581855f7984dc63d67a863dd689b351f19fa21feb98e6448d338da30cd14241c0dd138e5b1a58c41812d3ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Text--Patch \
perl-Text-Patch"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Text--Diff"

inherit rpm
