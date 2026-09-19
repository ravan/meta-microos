SUMMARY = "Paragraph reformatter"
DESCRIPTION = "par is a filter which copies its input to its output, changing all \
white characters (except newlines) to spaces, and reformatting \
each paragraph.  Paragraphs are separated by protected, blank, and \
bodiless lines, and optionally delimited by indentation. \
 \
Each output paragraph is generated from the corresponding input \
paragraph as follows: \
 \
1) An optional prefix and/or suffix is removed from each input line. \
2) The remainder is divided into words (separated by spaces). \
3) The words are joined into lines to make an eye-pleasing paragraph. \
4) The prefixes and suffixes are reattached. \
 \
If there are suffixes, spaces are inserted before them so that they all \
end in the same column."
LICENSE = "MIT"

PV = "1.53.0+git.1736064647.1430e33"

RPM_NAME = "par_text-1.53.0+git.1736064647.1430e33-1.5.aarch64.rpm"
RPM_HASH = "13cf29d825ef221b3315603db96408fb8381719972b2ea027af5f8c93730454829ce8a4208c2757248b1a98b5496456f89aea97d99c9da17fe6bedc0a9c85c26"

RPROVIDES:${PN} += "par-text"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
