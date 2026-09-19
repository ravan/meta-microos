SUMMARY = "Utility library for i18n relied on by various Repoze and Pyramid packages"
DESCRIPTION = "A library used by various Pylons Project packages for internationalization \
(i18n) duties related to translation. \
 \
This package provides a translation string class, a translation string factory \
class, translation and pluralization primitives, and a utility that helps \
Chameleon templates use translation facilities of this package. It does not \
depend on Babel, but its translation and pluralization services are meant to \
work best when provided with an instance of the babel.support.Translations class."
LICENSE = "SUSE-Repoze"

PV = "1.4"

RPM_NAME = "python314-translationstring-1.4-4.5.noarch.rpm"
RPM_HASH = "10771765a5280864a84462b0bb9cfb33d116114973c0a9a1311f7814caaed4a7ec486523a7a173fa9768b507e4596aa7d6b6881cefe9dc54e30dc225a865cbaa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-translationstring \
python314-translationstring \
python3dist-translationstring"

RDEPENDS:${PN} += "python-abi"

inherit rpm
