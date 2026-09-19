SUMMARY = "Database of robots.txt-derived permissions"
DESCRIPTION = "This module parses _/robots.txt_ files as specified in at \
https://www.robotstxt.org/robotstxt.html. Webmasters can use the \
_/robots.txt_ file to forbid conforming robots from accessing parts of \
their web site. \
 \
The parsed files are kept in a 'WWW::RobotRules' object, and this object \
provides methods to check if access to a given URL is prohibited. The same \
'WWW::RobotRules' object can be used for one or more parsed _/robots.txt_ \
files on any number of hosts. \
 \
The following methods are provided: \
 \
* $rules = WWW::RobotRules->new($robot_name) \
 \
This is the constructor for WWW::RobotRules objects. The first argument \
given to new() is the name of the robot. \
 \
* $rules->parse($robot_txt_url, $content, $fresh_until) \
 \
The parse() method takes as arguments the URL that was used to retrieve the \
_/robots.txt_ file, and the contents of the file. \
 \
* $rules->allowed($uri) \
 \
Returns TRUE if this robot is allowed to retrieve this URL. \
 \
* $rules->agent([$name]) \
 \
Get/set the agent name. NOTE: Changing the agent name will clear the \
_robots.txt_ rules and expire times out of the cache."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "6.30.0"

RPM_NAME = "perl-WWW-RobotRules-6.30.0-1.3.noarch.rpm"
RPM_HASH = "ca9318abafec82890ae9e8612178d3f075ab74f3980ba0ab00dfea43694fc15246e56e3af2df58282525b5b92b8f58f67b7a5ac20e07c9dad7d556d0314b26ba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-WWW--RobotRules \
perl-WWW--RobotRules--AnyDBM-File \
perl-WWW--RobotRules--DB-File \
perl-WWW--RobotRules--InCore \
perl-WWW-RobotRules"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-URI"

inherit rpm
