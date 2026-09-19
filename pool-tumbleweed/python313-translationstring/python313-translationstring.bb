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

RPM_NAME = "python313-translationstring-1.4-4.5.noarch.rpm"
RPM_HASH = "a53dbe77e57564d19dcf7a76c76d51f486c9d4dbe49352802ad843cad5bea1361e4f37056537ecca3dcddea2c7cbd65aa50a0a048c051297134eac0c489a621c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-translationstring \
python3.13dist-translationstring \
python313-translationstring \
python3dist-translationstring"

RDEPENDS:${PN} += "python-abi"

inherit rpm
