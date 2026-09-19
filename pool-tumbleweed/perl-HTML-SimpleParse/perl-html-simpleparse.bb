SUMMARY = "a bare-bones HTML parser"
DESCRIPTION = "This is the HTML::SimpleParse module.  It is a bare-bones HTML parser, \
similar to HTML::Parser, but with a couple important distinctions: \
 \
First, HTML::Parser knows which tags can contain other tags, which \
start tags have corresponding end tags, which tags can exist only in \
the <HEAD> portion of the document, and so forth.  HTML::SimpleParse \
does not know any of these things.  It just finds tags and text in the \
HTML you give it, it does not care about the specific content of these \
tags (though it does distiguish between different _types_ of tags, such \
as comments, starting tags like <b>, ending tags like </b>, and so on). \
 \
Second, HTML::SimpleParse does not create a hierarchical tree of HTML \
content, but rather a simple linear list.  It does not pay any \
attention to balancing start tags with corresponding end tags, or which \
pairs of tags are inside other pairs of tags. \
 \
Because of these characteristics, you can make a very effective HTML \
filter by sub-classing HTML::SimpleParse. \
 \
 \
 \
Authors: \
-------- \
    Ken Williams <ken@forum.swarthmore.edu>"
LICENSE = "Artistic-1.0"

PV = "0.12"

RPM_NAME = "perl-HTML-SimpleParse-0.12-284.31.noarch.rpm"
RPM_HASH = "81c2ac270751d3289d66dfe5d97e965cf49ce5dca558154e58aa6f63f1f442780edb34d216ee0cc082120bbb589359bb6277733d70e026783b7195a60e24cc53"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "HTML-SimpleParse \
perl-HTML--SimpleParse \
perl-HTML-SimpleParse"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
