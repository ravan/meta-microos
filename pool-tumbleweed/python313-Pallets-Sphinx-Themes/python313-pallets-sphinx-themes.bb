SUMMARY = "Themes for the Pallets projects"
DESCRIPTION = "Themes for the Pallets projects. If you’re writing an extension, use \
the appropriate theme to make your documentation look consistent. \
Available themes: flask, jinja, werkzeug, click"
LICENSE = "BSD-3-Clause"

PV = "2.5.0"

RPM_NAME = "python313-Pallets-Sphinx-Themes-2.5.0-1.2.noarch.rpm"
RPM_HASH = "e44b1b22a2dee7fe38eb7c259e3ebec479b8f524a3f2404b75c0ef03326512930781952beeef8d290ed370b9f112636d003a509c3c3a46f20e0b1b9e071a4b13"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Pallets-Sphinx-Themes \
python3.13dist-pallets-sphinx-themes \
python313-Pallets-Sphinx-Themes \
python3dist-pallets-sphinx-themes"

RDEPENDS:${PN} += "python-abi \
python313-Sphinx \
python313-packaging \
python313-sphinx-notfound-page"

inherit rpm
