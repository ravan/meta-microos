SUMMARY = "Javadoc for paperclips"
DESCRIPTION = "Simple, light weight, extensible Java printing plug-in for SWT. PaperClips \
hides the complexity of laying out and rendering documents on the printer, \
helping you focus on what to print instead of how to print it. \
 \
In a nutshell, PaperClips provides an assortment of document 'building \
blocks,' which you can tweak and combine to form a custom document. The \
assembled document is then sent to PaperClips for printing. PaperClips \
includes support for printing text, images, borders, headers and footers, \
column layouts and grid layouts, to name a few. It can also be extended with \
your own printable classes. \
 \
With PaperClips you do not have to track cursors, calculate line breaking, \
fool around with font metrics, or manage system resources--it's all handled \
internally. And unlike report-generation tools, you are not constrained to a \
predefined document structure (like report bands). Every document is custom \
and the layout is up to you."
LICENSE = "EPL-1.0"

PV = "1.0.4"

RPM_NAME = "paperclips-javadoc-1.0.4-7.6.noarch.rpm"
RPM_HASH = "5c828e5493cac5d0e951e1fefa1e0b95b8c1c741f16b2796c4af3ed85e6d085fc9dfa6cc5ea77d8f0dc2865f988c225681df9187ec9a34720a5b9a41ca44249f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "paperclips-javadoc"

RDEPENDS:${PN} += ""

inherit rpm
