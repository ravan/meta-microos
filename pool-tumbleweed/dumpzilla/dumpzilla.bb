SUMMARY = "Firefox browser forensic tool"
DESCRIPTION = "Extract all forensic interesting information from Firefox, \
Iceweasel and Seamonkey browsers. \
Works in command line interface, so information dumps could be \
redirected by pipes with tools such as grep, awk, cut, sed... \
Dumpzilla allows to visualize following sections, search \
customization and extract certain content. \
 \
Features: \
 * Cookies + DOM Storage (HTML 5). \
 * User preferences (Domain permissions, Proxy settings...). \
 * Downloads. \
 * Web forms (Searches, emails, comments..). \
 * Historial. \
 * Bookmarks. \
 * Cache HTML5 Visualization / Extraction (Offline cache). \
 * visited sites 'thumbnails' Visualization / Extraction . \
 * Addons / Extensions and used paths or urls. \
 * Browser saved passwords. \
 * SSL Certificates added as a exception. \
 * Session data (Webs, reference URLs and text used in forms). \
 * Visualize live user surfing, Url used in each tab or window \
   and use of forms."
LICENSE = "GPL-3.0-or-later"

PV = "0.0.0+git.20210311"

RPM_NAME = "dumpzilla-0.0.0+git.20210311-1.10.noarch.rpm"
RPM_HASH = "a24bc0296ceb6fcf4704753808193dfeda324dbbd1670ac28a5a165517a22a96ea8a2f033ce42581ef01f9b750c498491eafd36e9675f15f484d7373e3b9ec19"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dumpzilla"

RDEPENDS:${PN} += "/usr/bin/python3 \
python3-lz4 \
python3-python-magic"

inherit rpm
