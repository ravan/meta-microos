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

RPM_NAME = "python313-furo-2025.12.19-1.4.noarch.rpm"
RPM_HASH = "e4c69ee244275f7e8569e85b1c5158809c4f643a33fc715dbbec6096ef138cd3252ab8c854707708d0a6ff687f0c4acc857fe09cd5b85ae0552513260b72d756"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-furo \
python3.13dist-furo \
python313-furo \
python3dist-furo"

RDEPENDS:${PN} += "python-abi \
python313-Sphinx \
python313-accessible-pygments \
python313-beautifulsoup4 \
python313-pygments \
python313-sphinx-basic-ng"

inherit rpm
