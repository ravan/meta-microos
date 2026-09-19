SUMMARY = "A Python library for rich text and beautiful formatting in the terminal"
DESCRIPTION = "Render rich text, tables, progress bars, syntax highlighting, \
markdown and more to the terminal."
LICENSE = "MIT"

PV = "15.0.0"

RPM_NAME = "python314-rich-15.0.0-3.1.noarch.rpm"
RPM_HASH = "9803309ffa16f44257bbd2463e0934c862d3a07bf8c796fa2d2e8183e94f97a55c42b72420e5bc3ef388933a94deaff9be539167b4e812a1b5cc5f59e9a5f9ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-rich \
python314-rich \
python3dist-rich"

RDEPENDS:${PN} += "python-abi \
python314-markdown-it-py \
python314-pygments"

inherit rpm
