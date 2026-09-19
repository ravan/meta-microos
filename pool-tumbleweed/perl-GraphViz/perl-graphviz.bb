SUMMARY = "Interface to AT&T's GraphViz. Deprecated. See GraphViz2"
DESCRIPTION = "This module provides an interface to layout and image generation of \
directed and undirected graphs in a variety of formats (PostScript, PNG, \
etc.) using the 'dot', 'neato', 'twopi', 'circo' and 'fdp' programs from \
the Graphviz project (http://www.graphviz.org/ or \
http://www.research.att.com/sw/tools/graphviz/). \
 \
GraphViz is deprecated in favour of GraphViz2."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "2.26"

RPM_NAME = "perl-GraphViz-2.26-1.17.noarch.rpm"
RPM_HASH = "c059a2d22212a94ec2e91b3658202b735847d9f08defeefd047f9198eb7b552d3695e66d53f4d6635e921b376b6dd573ab3bd3c3e4af006f2f2d8e396b8f34ee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-DB \
perl-Devel--GraphVizProf \
perl-GraphViz \
perl-GraphViz--Data--Grapher \
perl-GraphViz--No \
perl-GraphViz--Parse--RecDescent \
perl-GraphViz--Parse--Yacc \
perl-GraphViz--Parse--Yapp \
perl-GraphViz--Regex \
perl-GraphViz--Small \
perl-GraphViz--XML"

RDEPENDS:${PN} += "cairo \
graphviz \
graphviz-gnome \
pango \
perl--MODULE-COMPAT-5.44.0 \
perl-File--Which \
perl-IPC--Run \
perl-LWP--Simple \
perl-Parse--RecDescent \
perl-XML--Twig \
perl-XML--XPath"

inherit rpm
