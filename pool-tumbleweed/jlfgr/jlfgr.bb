SUMMARY = "Java look and feel Graphics Repository"
DESCRIPTION = "These pages contain a collection of toolbar button graphics. The \
graphics have been designed specifically for use with the Java look and \
feel. They conform to the Java look and feel Design Guidelines. A set \
of attributes accompanies each graphic. This information can easily be \
used to create Swing Actions. \
 \
As the Human Interface Group, we strive to improve the user experience \
for you and your end-users. This graphics repository provides you with \
professional quality graphics that will save you development time. Your \
end-users benefit by leveraging their knowledge of these graphics and \
terminology across different Java look and feel applications. \
 \
To provide feedback about the graphics repository, send email to the \
Java look and feel Design Team (jlfdesign (at) sun (dot) com)."
LICENSE = "SUSE-Redistributable-Content"

PV = "1.0"

RPM_NAME = "jlfgr-1.0-24.14.noarch.rpm"
RPM_HASH = "e6a615cb9f2edcbda84dcde42bbb2b473eb3a7f4d35e239c5ecd75917463e9d666476b4724efd0f07bf5881dcef77c55a52d3cead36e42b2dc74bb4660033cfd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jlfgr"

RDEPENDS:${PN} += ""

inherit rpm
