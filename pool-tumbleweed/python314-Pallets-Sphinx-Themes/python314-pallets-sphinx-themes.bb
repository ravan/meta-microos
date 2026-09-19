SUMMARY = "Themes for the Pallets projects"
DESCRIPTION = "Themes for the Pallets projects. If you’re writing an extension, use \
the appropriate theme to make your documentation look consistent. \
Available themes: flask, jinja, werkzeug, click"
LICENSE = "BSD-3-Clause"

PV = "2.5.0"

RPM_NAME = "python314-Pallets-Sphinx-Themes-2.5.0-1.2.noarch.rpm"
RPM_HASH = "a41addf762358dec055d9ca69ad3a0c3eb82d80a1ef872f0f8b995b0322af3cd4b75d04de5a1675df04480b6d36e80fd6cc787defe4a30d88ab88948324b2f84"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pallets-sphinx-themes \
python314-Pallets-Sphinx-Themes \
python3dist-pallets-sphinx-themes"

RDEPENDS:${PN} += "python-abi \
python314-Sphinx \
python314-packaging \
python314-sphinx-notfound-page"

inherit rpm
