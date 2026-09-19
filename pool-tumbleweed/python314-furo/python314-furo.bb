SUMMARY = "Clean customisable Sphinx documentation theme"
DESCRIPTION = "Furo is a Sphinx theme, which is: \
- Intentionally minimal --- the most important thing is the content, not \
  the scaffolding around it. \
- Responsive --- adapting perfectly to the available screen space, to \
  work on all sorts of devices. \
- Customizable --- change the color palette, font families, logo and \
  more! \
- Easy to navigate --- with carefully-designed sidebar navigation and \
  inter-page links. \
- Good looking content --- through clear typography and well-stylized \
  elements. \
- Good looking search --- helps readers find what they want quickly. \
- Biased for smaller docsets --- intended for smaller documentation \
  sets, where presenting the entire hierarchy in the sidebar is not \
  overwhelming.}"
LICENSE = "MIT"

PV = "2025.12.19"

RPM_NAME = "python314-furo-2025.12.19-1.4.noarch.rpm"
RPM_HASH = "0635ffef46be2c1cbcd268675cc78d1fee816a696e10d5474aabcdd21f5df5348763a4da5fd27b16fd867a00f9a7468abb812a4cc0c66d1f321e684bc1b066f4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-furo \
python314-furo \
python3dist-furo"

RDEPENDS:${PN} += "python-abi \
python314-Sphinx \
python314-accessible-pygments \
python314-beautifulsoup4 \
python314-pygments \
python314-sphinx-basic-ng"

inherit rpm
